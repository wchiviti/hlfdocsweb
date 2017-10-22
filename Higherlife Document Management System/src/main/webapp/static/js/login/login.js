$(document).ready(function () {
    $('#btnLogin').click(function () {
        $.blockUI({
            message: "<h5>Loading account details</h5><p>please wait...</p>",
            css: {
                border: "none",
                padding: "15px",
                backgroundColor: "#000",
                '-webkit-border-radius': "10px",
                '-moz-border-radius': "10px",
                opacity: .5,
                color: "#fff"
            },
            onBlock: function () {
                setTimeout(function () {
                    var email = $('#txtemail').val();
                    if (email.length < 5) {
                        $.alert({
                            title: 'Warning!!!',
                            content: 'Please enter your email!',
                            theme: 'supervan',
                            confirmButtonClass: 'btn-warning',
                            icon: 'fa fa-warning'
                        });
                    }
                    var password = $('#txtpassword').val();
                    if (password.length < 1) {
                        $.alert({
                            title: 'Warning!!!',
                            content: 'Please enter your password!',
                            theme: 'supervan',
                            confirmButtonClass: 'btn-warning',
                            icon: 'fa fa-warning'
                        });
                    }
                   
                    $.webMethod({
                        methodName: "Handler/Backend.svc/json/SignIn",
                        async: true,
                        parameters: {
                            userKey: email,
                            unlockCode: password,
                            persist:true

                        },
                        success: function (response) {
                            if (response !== undefined && response !== null) {
                                if (response.SignInResult.Success === true) {
                                    window.location.href = "/profile.html";
                                } else {
                                    $.alert({
                                        title: 'Error!!!',
                                        content: response.SignInResult.Message,
                                        theme: 'supervan',
                                        confirmButtonClass: 'btn-danger',
                                        icon: 'fa fa-times-circle'
                                    });
                                }
                            } else {
                                $.alert({
                                    title: 'Error!!!',
                                    content: 'No response received from server.',
                                    theme: 'supervan',
                                    confirmButtonClass: 'btn-danger',
                                    icon: 'fa fa-times-circle'
                                });
                            }
                        },
                        error: function (error) {
                            console.log(error.responseText);
                        }
                    });
                }, 1000);
            }
        });
    });
});