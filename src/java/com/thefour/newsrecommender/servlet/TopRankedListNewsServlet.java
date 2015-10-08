/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thefour.newsrecommender.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Quang Quang
 */
@WebServlet(name = "TopRankedListNews", urlPatterns = {"/toprankedlistnews"})
public class TopRankedListNewsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
           //kiểm tra query string để trả về số lượng bài báo theo yêu cầu
            // ví dụ ?offset=10 nghĩa là đã nhận đc 10 bài báo
            // yêu cầu gửi tiếp từ bài báo thứ 11->20
            out.println("{\n" +
"	\"news\":[\n" +
"	{\n" +
"		\"id\":\"1\",\n" +
"		\"title\":\"Hy Lạp chính thức được cứu\",\n" +
"		\"contenturl\":\"http://kinhdoanh.vnexpress.net/tin-tuc/quoc-te/hy-lap-chinh-thuc-duoc-cuu-3262290.html\",\n" +
"		\"categoryid\":\"2\",\n" +
"		\"sourceid\":\"1\",\n" +
"		\"description\":\"Chính quyền Athens và các chủ nợ vừa đạt thỏa thuận về gói giải cứu cung cấp tới 86 tỷ euro (94 tỷ USD), người phát ngôn Bộ Tài chính Hy Lạp cho biết.\",\n" +
"		\"imageurl\":\"http://c1.f25.img.vnecdn.net/2015/08/11/Hy-Lap-2802-1439279226.jpg\",\n" +
"		\"time\":\"2015-08-11 14:59\",\n" +
"		\"rating\":\"1995\"\n" +
"	},\n" +
"	{\n" +
"		\"id\":\"2\",\n" +
"		\"title\":\"Máy bay không người lái có thể bị bắn hạ bởi… âm thanh\",\n" +
"		\"contenturl\":\"http://www.thanhnien.com.vn/cong-nghe-thong-tin/may-bay-khong-nguoi-lai-co-the-bi-ban-ha-boi-am-thanh-595700.html\",\n" +
"		\"categoryid\":\"4\",\n" +
"		\"sourceid\":\"2\",\n" +
"		\"description\":\"(TNO) Máy bay không người lái (UAV) từ lâu là vũ khí vô cùng nguy hiểm với khả năng do thám quân sự và tấn công chớp nhoáng nhưng rất khó phát hiện. Tuy nhiên, nghiên cứu mới của các nhà khoa học Hàn Quốc cho biết sóng âm có khả năng tấn công UAV, theo Daily News New York (Mỹ) ngày 10.8\",\n" +
"		\"imageurl\":\"http://static.thanhnien.com.vn/uploaded/hoanguy/2015_08_11/drone_kwyn.jpg\",\n" +
"		\"time\":\"2015-08-11 15:25\",\n" +
"		\"rating\":\"500\"\n" +
"	},\n" +
"	{\n" +
"		\"id\":\"3\",\n" +
"		\"title\":\"Bộ tứ siêu đẳng - bom xịt của mùa phim hè 2015\",\n" +
"		\"contenturl\":\"http://giaitri.vnexpress.net/tin-tuc/phim/diem-phim/bo-tu-sieu-dang-bom-xit-cua-mua-phim-he-2015-3260989.html\",\n" +
"		\"categoryid\":\"3\",\n" +
"		\"sourceid\":\"1\",\n" +
"		\"description\":\"Kịch bản dài dòng và tẻ nhạt, kỹ xảo sơ sài, các pha hành động ít ỏi, diễn viên không thu hút bằng dàn sao cũ khiến phim siêu anh hùng mới nhất dựa trên truyện tranh Marvel gây thất vọng.\",\n" +
"		\"imageurl\":\"http://c1.f9.img.vnecdn.net/2015/08/10/604383ac-6bb3-4649-a500-0d5-6118-1439185082.jpg\",\n" +
"		\"time\":\"2015-08-11 9:15\",\n" +
"		\"rating\":\"300\"\n" +
"	}\n" +
"]}");
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
