$(function () {
    $.post('/myBlog/getArticles',function (data) {
        console.log(data);
        var str = '';
        $(data).each(function () {
            str += `<li>
            <a href="#">
                <h3 class="subTitle">${this.title}</h3>
            </a>
            <a href="#">
                <p>${this.article.substring(0,200)}...</p>
            </a>
            <p class="subInfo">${this.modifyTime} | 阅读数</p>
        </li>`;
        });
        $('#info ul').append(str);
    });
});