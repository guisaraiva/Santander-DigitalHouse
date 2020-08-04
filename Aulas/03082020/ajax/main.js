const config = {
    method: "GET",
    url: "cidades.json",
    sucess: function(response){
        const cidades = JSON.parse(response);
        console.log(cidades);
    },
    error: function(err){
        console.log(...err);
    }
};

function ajax (config) {
    const xhr = new XMLHttpRequest();
    xhr.open(config.method, config.url, true);

    xhr.onload = e => {
        if (xhr.status >= 200 &&  xhr.status < 300){
            config.sucess(xhr.response)
        }
        else if (xhr.status >= 400){
            config.error({
                code: xhr.status,
                text: xhr.statusText
            });
        }
    }
    xhr.send();
};

ajax(config)