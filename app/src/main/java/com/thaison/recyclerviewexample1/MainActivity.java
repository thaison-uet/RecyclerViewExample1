package com.thaison.recyclerviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSongs;
    private SongAdapter songAdapter;
    private List<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSongs = (RecyclerView) findViewById(R.id.rv_songs);

        songs = new ArrayList<>();
        songs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu một tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        songs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        songs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        songs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        songs.add(new Song("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        songs.add(new Song("60685", "MỞ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        songs.add(new Song("60752", "TÌNH YÊU CHẮP VÁ", "Muốn đi xa nơi yêu thương mình từng có Để không nghe", "Mr. Siro"));
        songs.add(new Song("60608", "CHỜ NGÀY MƯA TAN", "Một ngày mưa và em khuất xa nơi anh bóng dáng cứ", "Trung Đức"));
        songs.add(new Song("60603", "CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em một lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        songs.add(new Song("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        songs.add(new Song("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thiện Ngôn"));
        songs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu một tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        songs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        songs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        songs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        songs.add(new Song("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        songs.add(new Song("60685", "MỞ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        songs.add(new Song("60752", "TÌNH YÊU CHẮP VÁ", "Muốn đi xa nơi yêu thương mình từng có Để không nghe", "Mr. Siro"));
        songs.add(new Song("60608", "CHỜ NGÀY MƯA TAN", "Một ngày mưa và em khuất xa nơi anh bóng dáng cứ", "Trung Đức"));
        songs.add(new Song("60603", "CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em một lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        songs.add(new Song("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        songs.add(new Song("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thiện Ngôn"));
        songs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu một tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        songs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        songs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        songs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        songs.add(new Song("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        songs.add(new Song("60685", "MỞ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        songs.add(new Song("60752", "TÌNH YÊU CHẮP VÁ", "Muốn đi xa nơi yêu thương mình từng có Để không nghe", "Mr. Siro"));
        songs.add(new Song("60608", "CHỜ NGÀY MƯA TAN", "Một ngày mưa và em khuất xa nơi anh bóng dáng cứ", "Trung Đức"));
        songs.add(new Song("60603", "CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em một lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        songs.add(new Song("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        songs.add(new Song("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thiện Ngôn"));
        songs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu một tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        songs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        songs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        songs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        songs.add(new Song("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        songs.add(new Song("60685", "MỞ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        songs.add(new Song("60752", "TÌNH YÊU CHẮP VÁ", "Muốn đi xa nơi yêu thương mình từng có Để không nghe", "Mr. Siro"));
        songs.add(new Song("60608", "CHỜ NGÀY MƯA TAN", "Một ngày mưa và em khuất xa nơi anh bóng dáng cứ", "Trung Đức"));
        songs.add(new Song("60603", "CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em một lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        songs.add(new Song("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        songs.add(new Song("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thiện Ngôn"));

        songAdapter = new SongAdapter(songs, this);
        rvSongs.setAdapter(songAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false);
        rvSongs.setLayoutManager(linearLayoutManager);
    }
}
