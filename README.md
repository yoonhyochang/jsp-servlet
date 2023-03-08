<button onclick="copyToClipboard()">코드 복사하기</button>

<script>
function copyToClipboard() {
  const htmlCode = document.querySelector('code').innerText;
  const el = document.createElement('textarea');
  el.value = htmlCode;
  document.body.appendChild(el);
  el.select();
  document.execCommand('copy');
  document.body.removeChild(el);
  alert('코드가 복사되었습니다!');
}
</script>

<code>
  <!-- 여기에 복사할 HTML 코드를 작성합니다. -->
</code>
