const products = [
            { name: '볼티아 트림 부츠컷 팬츠', price: 50000, discount: 10, discountAmount: 5000 },
            { name: '더보이핏 데님 팬츠', price: 60000, discount: 15, discountAmount: 9000 },
            { name: '아이코닉 블랙 자켓', price: 80000, discount: 20, discountAmount: 16000 },
            
        ];

        // Function to search products by name
        function search_clothe() {
            const searchQuery = document.getElementById('crop').value.toLowerCase(); // Get search query
            const results = products.filter(product => product.name.toLowerCase().includes(searchQuery)); // Filter products

            // Display results
            displayResults(results);
        }

        // Function to display products in the search results section
        function displayResults(products) {
            const searchResultsDiv = document.getElementById('searchResults');
            searchResultsDiv.innerHTML = ''; // Clear previous results

            if (products.length === 0) {
                searchResultsDiv.innerHTML = '<p>검색된 상품이 없습니다.</p>';
            } else {
                products.forEach(product => {
                    const productDiv = document.createElement('div');
                    productDiv.innerHTML = `
                        <h3>${product.name}</h3>
                        <p>가격: ${product.price} 원</p>
                        <p>할인율: ${product.discount}%</p>
                        <p>할인금액: ${product.discountAmount} 원</p>
                    `;
                    searchResultsDiv.appendChild(productDiv);
                });
            }
        }

        // Function to show all products (when "전체" button is clicked)
        function all_clothes() {
            displayResults(products);
        }

        // You can implement the sorting function in the "select" dropdown
        function gugu(value) {
            // Sort the products based on the selected option (e.g., name, price)
            let sortedProducts;
            if (value === 'even') {
                sortedProducts = [...products].sort((a, b) => a.name.localeCompare(b.name));
            } else if (value === 'odd') {
                sortedProducts = [...products].sort((a, b) => a.price - b.price);
            }
            displayResults(sortedProducts);
        }