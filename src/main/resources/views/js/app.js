var button = document.getElementById('calculate');

console.log(button);
button.addEventListener('click', function () {
    var data = document.getElementById('data').value
    console.log(data);
    var datos = data.split(",");
    $('#resultsBody').remove();
    for (i = 0; i < datos.length; i++) {
        $('#results').append(`
        <tr>
            <td>` + datos[i] + `</td>
                  
        </tr>
           
        `);

    }
    console.log(datos);
    axios.post('https://swilsonsparkweb.herokuapp.com/statistics/calculate/', data)
    //axios.post('http://localhost:4567/statistics/calculate/', data)
        .then(res => {
            var obj = JSON.parse(res.data);
            $('#results').append(`
                 <tr>
                     <td> mean :` + obj.mean +  `</td>
                     <td> Standard deviations :` + obj.std +  `</td>                  
                 </tr>
           
            `);
        })
        .catch(function (err) {
            console.log(err);
        })
});