function Login () {

    this.init = function () {
        $("#googleLogin").on("click", function () {
            console.info("via google");
            $.ajax({
                type: "POST",
                url: "/login/google",
                beforeSend: function(request) {
                    request.setRequestHeader("grant_type", "client_credentials");
                    request.setRequestHeader("client_id", "221081344470-rg4n7aeftjnpqhv1pu348gv67ftnqvbi.apps.googleusercontent.com");
                    request.setRequestHeader("client_secret", "HjyuhhP0wJTQCWNz-nJgQeXc");
                    request.setRequestHeader("Content-Type", "application/json");
                    request.setRequestHeader("Accept", "application/json");
                },
                data: {},
                success: {},
                error: {}
            })
        });

        $("#facebookLogin").on("click", function () {
            console.info("via facebook");

            $.ajax({
                type: "GET",
                url: "/api/testapi",
                data: {
                    aaa: "asdasd"
                },
                success: {},
                error: {}
            })
        });

    };
}