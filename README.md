
Possibilidade de uso da API BuscaPé usufruindo de Interfaces Fluente (Fluent Interfaces).

Por exemplo:
<pre>Result resultado = buscape.findCategoryList().setKeyword(categoria).call();</pre>

<pre>Result resultado = buscape.findOfferList().setProductId(idProduto).sortByPrice().call();</pre>

