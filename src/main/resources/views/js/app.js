var button = document.getElementById('calculate');

console.log(button);
button.addEventListener('click', function () {
    var data = document.getElementById('data').value
    console.log(data);
    var datos = data.split(",");

    console.log(datos);
    //axios.post('https://swilsonsparkweb.herokuapp.com/statistics/calculate/', data)
    axios.post('http://localhost:4567/calculate/', data)
        .then(res => {
            //console.log("res")
            //console.log(res)
            var result = JSON.parse(res.data)
            console.log("json result")
            console.log(result)
            
            document.getElementById("resultList").innerHTML = "["+ result.List + "]";
            document.getElementById("listSum").innerHTML = result.sum ;
            
            
            
        })
        .catch(function (err) {
            console.log(err);
        })
});