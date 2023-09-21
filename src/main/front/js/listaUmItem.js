// Function to fetch data for a specific ID
function fetchProductById(productId) {
    const url = `http://localhost:8080/api/mercadinhofull/${productId}`;
  
    fetch(url)
      .then((response) => response.json())
      .then((product) => {
        // Display the data for the specific product
        const productData = `
          <tbody>
            <tr>
              <th scope="row">${product.id}</th>
              <td>${product.nomeProduto}</td>
              <td>R$${product.precoProduto}</td>
              <td>${product.quantidadeProduto}</td>
              <td>${product.descricaoProduto}</td>
            </tr>
          </tbody>
        `;
  
        document.getElementById("listaProdutoId").innerHTML = productData;
      })
      .catch((error) => console.error("Error fetching product:", error));
  }
  
const url = new URLSearchParams(window.location.search);
const id = url.get('id');
const productId = id; 
 fetchProductById(productId);
  