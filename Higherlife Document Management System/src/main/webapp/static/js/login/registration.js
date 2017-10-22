$(document).ready(function () {
    $('#btnRegister').click(function (e) {
        e.preventDefault();
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
                if (email.length<5) {
                    $.alert({
                        title: 'Warning!!!',
                        content: 'Please enter your email!',
                        theme: 'supervan',
                        confirmButtonClass: 'btn-warning',
                        icon: 'fa fa-warning'
                    });
                }
                var reemail = $('#txtReemail').val();
                if (email !== reemail) {
                    $.alert({
                        title: 'Warning!!!',
                        content: 'Emails are different!',
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
                var repassword = $('#txtrepassword').val();
                if (repassword !== password) {
                    $.alert({
                        title: 'Warning!!!',
                        content: 'Passwords are different!',
                        theme: 'supervan',
                        confirmButtonClass: 'btn-warning',
                        icon: 'fa fa-warning'
                    });
                }
                var application = new Application();
                var verifyUrl = application.getBaseURL();
              $.webMethod({
                  methodName: 'Handler/Backend.svc/json/SignUp',
                    async: true,
                    parameters: {
                        userKey: email,
                        unlockCode: password,
                        confirmation: password,
                        verifyUrl: verifyUrl
                        
                    },
                    success: function (response) {
                        if (response !== undefined && response !== null) {

                            if (response.SignUpResult.Success === true) {
                                $('#txtrepassword').val('');
                                $('#txtemail').val('');
                                $('#txtpassword').val('');
                                $('#txtReemail').val('');
                                $.alert({
                                    title: 'Success',
                                    content: response.SignUpResult.Message,
                                    theme: 'supervan',
                                    confirmButtonClass: 'btn-success',
                                    icon: 'fa fa-check'
                                });
                            } else {
                                $.alert({
                                    title: 'Error!!!',
                                    content: response.SignUpResult.Message,
                                    theme: 'supervan',
                                    confirmButtonClass: 'btn-danger',
                                    icon: 'fa fa-times'
                                });
                            }
                        } else {
                            $.alert({
                                title: 'Error!!!',
                                content: 'No response received from server.',
                                theme: 'supervan',
                                confirmButtonClass: 'btn-danger',
                                icon: 'fa fa-times'
                            });
                        }
                    },
                    error: function (error) {
                        console.log(error.statusText);
                    }
                });
            }, 1000);
        }
    });
    });
});


