fetch("http://localhost:8080/api/mercadinhofull").then((data)=>{
    return data.json();
  }).then((todosProdutos) =>{
      let data1 = "";
      todosProdutos.map((values) =>{
          data1 += `
          <tbody>
              <tr>
                  <th scope="row">${values.id} </td>
                  <td>${values.nomeProduto}</td> 
                  <td>${values.precoProduto}</td> 
                  <td>${values.quantidadeProduto} </td>
                  <td>${values.descricaoProduto}</td> 
              </tr>
          </tbody>
          `
      })
      document.getElementById("listaProdutos").innerHTML = data1;
      console.log(todosProdutos);
  })