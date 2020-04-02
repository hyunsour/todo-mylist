var main = {

init : function(){
    var _this = this;
    $('#btn-save').on('click', function(){
        if($('#title').val() != "")
            _this.save();
        else
            alert('내용을 입력하세요');
    });
    //remove
    $('.btn.btn-danger').on('click', function(){
        var id = $(this).data("id");
        console.log(id);
        _this.remove(id);
    });
    //update
    $('#btn-modify').on('click', function(){
        console.log("click");
        _this.modify();
    });

},
save : function(){
    var data = {
        title: $('#title').val(),
        content: '콩텐트',
        isFin: 'N'
        //content: $('#content').val()
    };

    $.ajax({
        type: 'PUT',
        url: '/api/v1/posts',
        dataType: 'json',
        contentType:'application/json;charset=utf-8',
        data: JSON.stringify(data)
    }).done(function(){
        location.reload();
    }).fail(function(error){
        alert(JSON.stringify(error));
    });
},//save

remove : function(id){

    $.ajax({
        type: 'DELETE',
        url: '/api/v1/posts/'+id,
        dataType: 'json',
        contentType:'application/json;charset=utf-8'
    }).done(function(){
        location.reload();
    }).fail(function(error){
        alert(JSON.stringify(error));
    });
},//remove

modify : function(){

    var data = {
        title:$('#title').val(),
        content:'content'
    };
    var id = $('#id').val();
    $.ajax({
        type: 'PUT',
        url: '/api/v1/posts/'+id,
        dataType: 'json',
        contentType:'application/json;charset=utf-8',
        data: JSON.stringify(data)
    }).done(function(){
        location.href="/index";
    }).fail(function(error){
        alert(JSON.stringify(error));
    });
}//modify

};//main

main.init();