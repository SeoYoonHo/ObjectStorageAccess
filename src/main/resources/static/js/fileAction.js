// 다운로드 버튼 클릭 핸들러
document.querySelectorAll('.download-btn').forEach(button => {
    button.addEventListener('click', function() {
        const fileName = this.getAttribute('data-filename');
        if (fileName) {
            window.location.href = `/download?fileName=${fileName}`;
        }
    });
});

// 삭제 버튼 클릭 핸들러
document.querySelectorAll('.delete-btn').forEach(button => {
    button.addEventListener('click', function() {
        const fileName = this.getAttribute('data-filename');
        if (fileName && confirm(`${fileName} 파일을 삭제하시겠습니까?`)) {
            fetch(`/delete?fileName=${fileName}`, { method: 'DELETE' })
                .then(response => {
                    if (response.ok) {
                        alert("파일이 삭제되었습니다.");
                        window.location.reload();
                    } else {
                        alert("삭제 실패.");
                    }
                });
        }
    });
});
