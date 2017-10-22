
$(document).ajaxStart(function () {
        $.blockUI({
            message: '<h3 style="color:blue"><img src="/images/google.gif" /><br/> Just a moment...</h3>',
            css: {
                border: 'none',
                padding: '10px',
                backgroundColor: "rgb(233,238,238)",
                '-webkit-border-radius': '10px',
                '-moz-border-radius': '10px',
                opacity: .8,
                baseZ: 2000,
                theme: true,
                color: "#fff"
            }
        });
    }
).ajaxStop(function() {
    $.unblockUI();
});