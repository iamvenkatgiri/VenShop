document.addEventListener('DOMContentLoaded', function () {
  var buttons = document.querySelectorAll('.add-to-cart');
  buttons.forEach(function (btn) {
    btn.addEventListener('click', function (e) {
      var name = e.currentTarget.getAttribute('data-product') || 'Item';
      alert(name + " added! Checkout coming soon.");
    });
  });

  var viewCart = document.getElementById('view-cart');
  if (viewCart) {
    viewCart.addEventListener('click', function () {
      alert('Cart and checkout are on the way!');
    });
  }
});
