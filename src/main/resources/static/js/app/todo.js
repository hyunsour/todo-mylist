var main = {

init : function(){
    var _this = this;
    $('#btn-save').on('click', function(){
        _this.save();
    });
},
save : function(){
    var data = {
        title: $('#title').val(),
        content: '콩텐트'
        //content: $('#content').val()
    };

    $.ajax({
        type: 'PUT',
        url: '/api/v1/posts',
        dataType: 'json',
        contentType:'application/json;charset=utf-8',
        data: JSON.stringify(data)
    }).done(function(){
        alert('글 등록 완료');
    }).fail(function(error){
        alert(JSON.stringify(error));
    });
}//save


};//main

main.init();