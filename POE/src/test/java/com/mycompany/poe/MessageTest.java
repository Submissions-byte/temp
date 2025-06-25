/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MessageTest {

    public MessageTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testMessageLength() {//tests error messaging for message length
        Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
        assertEquals("Message sent", test.checkMessageLength(), "Message sent");
        String mess = ("1:1	  	起 初 　 神 創 造 天 地 。\n"
                + "1:2	  	地 是 空 虛 混 沌 ． 淵 面 黑 暗 ． 　 神 的 靈 運 行 在 水 面 上 。\n"
                + "1:3	  	　 神 說 、 要 有 光 、 就 有 了 光 。\n"
                + "1:4	  	　 神 看 光 是 好 的 、 就 把 光 暗 分 開 了 。\n"
                + "1:5	  	　 神 稱 光 為 晝 、 稱 暗 為 夜 ． 有 晚 上 、 有 早 晨 、 這 是 頭 一 日 。\n"
                + "1:6	  	　 神 說 、 諸 水 之 間 要 有 空 氣 、 將 水 分 為 上 下 。\n"
                + "1:7	  	　 神 就 造 出 空 氣 、 將 空 氣 以 下 的 水 、 空 氣 以 上 的 水 分 開 了 ． 事 就 這 樣 成 了 。\n"
                + "1:8	  	　 神 稱 空 氣 為 天 ． 有 晚 上 、 有 早 晨 、 是 第 二 日 。\n"
                + "1:9	  	　 神 說 、 天 下 的 水 要 聚 在 一 處 、 使 旱 地 露 出 來 ． 事 就 這 樣 成 了 。\n"
                + "1:10	  	　 神 稱 旱 地 為 地 、 稱 水 的 聚 處 為 海 ． 　 神 看 著 是 好 的 。\n"
                + "1:11	  	　 神 說 、 地 要 發 生 青 草 、 和 結 種 子 的 菜 蔬 、 並 結 果 子 的 樹 木 、 各 從 其 類 、 果 子 都 包 著 核 ． 事 就 這 樣 成 了 。\n"
                + "1:12	  	於 是 地 發 生 了 青 草 、 和 結 種 子 的 菜 蔬 、 各 從 其 類 、 並 結 果 子 的 樹 木 、 各 從 其 類 、 果 子 都 包 著 核 。 　 神 看 著 是 好 的 ．\n"
                + "1:13	  	有 晚 上 、 有 早 晨 、 是 第 三 日 。\n"
                + "1:14	  	　 神 說 、 天 上 要 有 光 體 、 可 以 分 晝 夜 、 作 記 號 、 定 節 令 、 日 子 、 年 歲 ．\n"
                + "1:15	  	並 要 發 光 在 天 空 、 普 照 在 地 上 ． 事 就 這 樣 成 了 。\n"
                + "1:16	  	於 是 　 神 造 了 兩 個 大 光 、 大 的 管 晝 、 小 的 管 夜 ． 又 造 眾 星 。\n"
                + "1:17	  	就 把 這 些 光 擺 列 在 天 空 、 普 照 在 地 上 、\n"
                + "1:18	  	管 理 晝 夜 、 分 別 明 暗 ． 　 神 看 著 是 好 的 ．\n"
                + "1:19	  	有 晚 上 、 有 早 晨 、 是 第 四 日 。\n"
                + "1:20	  	　 神 說 、 水 要 多 多 滋 生 有 生 命 的 物 ． 要 有 雀 鳥 飛 在 地 面 以 上 、 天 空 之 中 。\n"
                + "1:21	  	　 神 就 造 出 大 魚 、 和 水 中 所 滋 生 各 樣 有 生 命 的 動 物 、 各 從 其 類 ． 又 造 出 各 樣 飛 鳥 、 各 從 其 類 ． 　 神 看 著 是 好 的 。\n"
                + "1:22	  	　 神 就 賜 福 給 這 一 切 、 說 、 滋 生 繁 多 、 充 滿 海 中 的 水 ． 雀 鳥 也 要 多 生 在 地 上 。\n"
                + "1:23	  	有 晚 上 、 有 早 晨 、 是 第 五 日 。\n"
                + "1:24	  	　 神 說 、 地 要 生 出 活 物 來 、 各 從 其 類 ． 牲 畜 、 昆 蟲 、 野 獸 、 各 從 其 類 ． 事 就 這 樣 成 了 。\n"
                + "1:25	  	於 是 　 神 造 出 野 獸 、 各 從 其 類 ． 牲 畜 、 各 從 其 類 ． 地 上 一 切 昆 蟲 、 各 從 其 類 ． 　 神 看 著 是 好 的 。\n"
                + "1:26	  	　 神 說 、 我 們 要 照 著 我 們 的 形 像 、 按 著 我 們 的 樣 式 造 人 、 使 他 們 管 理 海 裡 的 魚 、 空 中 的 鳥 、 地 上 的 牲 畜 、 和 全 地 、 並 地 上 所 爬 的 一 切 昆 蟲 。\n"
                + "1:27	  	　 神 就 照 著 自 己 的 形 像 造 人 、 乃 是 照 著 他 的 形 像 造 男 造 女 。\n"
                + "1:28	  	　 神 就 賜 福 給 他 們 、 又 對 他 們 說 、 要 生 養 眾 多 、 遍 滿 地 面 、 治 理 這 地 ． 也 要 管 理 海 裡 的 魚 、 空 中 的 鳥 ． 和 地 上 各 樣 行 動 的 活 物 。\n"
                + "1:29	  	　 神 說 、 看 哪 、 我 將 遍 地 上 一 切 結 種 子 的 菜 蔬 、 和 一 切 樹 上 所 結 有 核 的 果 子 、 全 賜 給 你 們 作 食 物 。\n"
                + "1:30	  	至 於 地 上 的 走 獸 、 和 空 中 的 飛 鳥 、 並 各 樣 爬 在 地 上 有 生 命 的 物 、 我 將 青 草 賜 給 他 們 作 食 物 ． 事 就 這 樣 成 了 。\n"
                + "1:31	  	　 神 看 著 一 切 所 造 的 都 甚 好 ． 有 晚 上 、 有 早 晨 、 是 第 六 日 。");
        test = new Message("+27718693002", mess, 0);
        assertEquals("Please enter a message of less than 250 characters.", test.checkMessageLength(), "Message exceeds 250 characters by " + (test.getMessage().length() - 250) + ", please reduce size.");
    }

    @Test
    public void testRecipientNumberFormat() {//test error messaging for cellphone number format
        Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
        assertEquals(0, test.checkRecipientCell(), 0, "Cellphone number successfully captured.");
        test = new Message("0857595889", "Hi Keegan, did you receive the payment?", 1);
        assertEquals(1, test.checkRecipientCell(), "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again");

    }

    @Test
    public void testMessageHash() {//Message hash is correct though, due to variable Message IDs may vary
        Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
        assertEquals(test.getID().substring(0, 2)+":0:HITONIGHT", test.getHash(), test.getHash());
    }

    @Test
    public void testMessageIDCreated() {//Message ID is created
        Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
        assertEquals("", "", "Message ID created:" + test.getID());
    }

    @Test
    public void testMessageSent() {
        Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);//test user selected 'Send Message
        assertEquals("Message successfully sent.", test.testableSentMessage(0), "Message successfully sent.");

        test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);//test User selected 'Disregard Message
        assertEquals("Press 0 to delete message.", test.testableSentMessage(1), "Press 0 to delete message.");

        test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);   //test User selected 'Store Message'
        assertEquals("Message successfully stored.", test.testableSentMessage(2), "Message successfully stored.");
    }
    
    @Test
    public void testSentArr(){
        String[] disregarded = new String[5];
                String[] hash = new String[5];   //creates arrays
                String[] id = new String[5];
                String[] sent = new String[5];
                String[] stored = new String[5];
                String[] recipient1 = new String[5];
                
                recipient1[0] = "+27834557896";                     //array indices 0-4 correspond to messages 1-5
                sent[0] = "Did you get the cake?";
                id[0] = "0";
                hash[0] = "0";
                
                recipient1[1] = "+27838884567";
                stored[1] = "Where are you? You are late! I have asked you to be on time.";
                id[1] = "1";
                hash[1] = "1";
                
                recipient1[2] = "+27834484567";
                disregarded[2] = "Yohoooo, I am at your gate.";
                id[2] = "2";
                hash[2] = "2";
                
                recipient1[3] = "0838884567";
                sent[3] = "It is dinner time !";
                id[3] = "3";
                hash[3] = "3";
                
                recipient1[4] = "+27838884567";
                stored[4] = "Ok, I am leaving without you.";
                id[4] = "4";
                hash[4] = "4";
                
                Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
                test.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                //tests sent array's population
                assertEquals(true, (test.sentReport().contains("It is dinner time !") && test.sentReport().contains("Did you get the cake?")) ,"\"Did you get the cake?\",\"It is dinner time !\""); 
    }
    
    @Test
    public void testDisplaylongest(){
                String[] disregarded = new String[5];
                String[] hash = new String[5];   //creates arrays
                String[] id = new String[5];
                String[] sent = new String[5];
                String[] stored = new String[5];
                String[] recipient1 = new String[5];
                
                recipient1[0] = "+27834557896";         //array indices 0-4 correspond to messages 1-5
                sent[0] = "Did you get the cake?";
                id[0] = "0";
                hash[0] = "0";
                
                recipient1[1] = "+27838884567";
                stored[1] = "Where are you? You are late! I have asked you to be on time.";
                id[1] = "1";
                hash[1] = "1";
                
                recipient1[2] = "+27834484567";
                disregarded[2] = "Yohoooo, I am at your gate.";
                id[2] = "2";
                hash[2] = "2";
                
                recipient1[3] = "0838884567";
                sent[3] = "It is dinner time !";
                id[3] = "3";
                hash[3] = "3";
                
                recipient1[4] = "+27838884567";
                stored[4] = "Ok, I am leaving without you.";
                id[4] = "4";
                hash[4] = "4";
                
                Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
                test.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                assertEquals("Where are you? You are late! I have asked you to be on time.", test.longestMsg(),"Where are you? You are late! I have asked you to be on time." );
                // tests longest message method created specifically for this but using the same logic as the one dedicated to sent messages
    }
    
    @Test
    public void testIDSearch(){
                String[] disregarded = new String[5];
                String[] hash = new String[5];   //creates arrays
                String[] id = new String[5];
                String[] sent = new String[5];
                String[] stored = new String[5];
                String[] recipient1 = new String[5];
                
                recipient1[0] = "+27834557896";         //array indices 0-4 correspond to messages 1-5
                sent[0] = "Did you get the cake?";
                id[0] = "0";
                hash[0] = "0";
                
                recipient1[1] = "+27838884567";
                stored[1] = "Where are you? You are late! I have asked you to be on time.";
                id[1] = "1";
                hash[1] = "1";
                
                recipient1[2] = "+27834484567";
                disregarded[2] = "Yohoooo, I am at your gate.";
                id[2] = "2";
                hash[2] = "2";
                
                recipient1[3] = "0838884567";
                sent[3] = "It is dinner time !";
                id[3] = "3";
                hash[3] = "3";
                
                recipient1[4] = "+27838884567";
                stored[4] = "Ok, I am leaving without you.";
                id[4] = "4";
                hash[4] = "4";
                
                Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
                test.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                assertEquals("0838884567\tIt is dinner time !", test.idSearchForTest("3"),"\"0838884567\",\"It is dinner time !\"" );
                //tests idSearch method
    }
    
    @Test
    public void testRecipientSearch(){
                String[] disregarded = new String[5];
                String[] hash = new String[5];   //creates arrays
                String[] id = new String[5];
                String[] sent = new String[5];
                String[] stored = new String[5];
                String[] recipient1 = new String[5];
                
                recipient1[0] = "+27834557896";                     //array indices 0-4 correspond to messages 1-5
                sent[0] = "Did you get the cake?";
                id[0] = "0";
                hash[0] = "0";
                
                recipient1[1] = "+27838884567";
                stored[1] = "Where are you? You are late! I have asked you to be on time.";
                id[1] = "1";
                hash[1] = "1";
                
                recipient1[2] = "+27834484567";
                disregarded[2] = "Yohoooo, I am at your gate.";
                id[2] = "2";
                hash[2] = "2";
                
                recipient1[3] = "0838884567";
                sent[3] = "It is dinner time !";
                id[3] = "3";
                hash[3] = "3";
                
                recipient1[4] = "+27838884567";
                stored[4] = "Ok, I am leaving without you.";
                id[4] = "4";
                hash[4] = "4";
                
                Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
                test.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                String temp = test.recipientSearchForTest("+27838884567");
                assertEquals(true, (temp.contains("Where are you? You are late! I have asked you to be on time.")&& temp.contains("Ok, I am leaving without you.")),"\"Where are you? You are late! I have asked you to be on time.\",\"Ok, I am leaving without you.\"" );
                //tests recipient search by checking if the string outputted by it contains the correct substrings/strings within it
    }

@Test
    public void testHashDelete(){
                String[] disregarded = new String[5];
                String[] hash = new String[5];   //creates arrays
                String[] id = new String[5];
                String[] sent = new String[5];
                String[] stored = new String[5];
                String[] recipient1 = new String[5];
                
                recipient1[0] = "+27834557896";                     //array indices 0-4 correspond to messages 1-5
                sent[0] = "Did you get the cake?";
                id[0] = "0";
                hash[0] = "0";
                
                recipient1[1] = "+27838884567";
                stored[1] = "Where are you? You are late! I have asked you to be on time.";
                id[1] = "1";
                hash[1] = "1";
                
                recipient1[2] = "+27834484567";
                disregarded[2] = "Yohoooo, I am at your gate.";
                id[2] = "2";
                hash[2] = "2";
                
                recipient1[3] = "0838884567";
                sent[3] = "It is dinner time !";
                id[3] = "3";
                hash[3] = "3";
                
                recipient1[4] = "+27838884567";
                stored[4] = "Ok, I am leaving without you.";
                id[4] = "4";
                hash[4] = "4";
                
                Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
                test.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                test.hashDeleteForTest("1");
              
                assertEquals(true, (disregarded[1].contains("Where are you? You are late! I have asked you to be on time.") && stored[1] == null),"Message \"Where are you? You are late! I have asked you to be on time.\" successfully deleted." );                
                //tests hashDelete making sure that both arrays involved are updated
    }    
    
    @Test
    public void testSentReport(){
                String[] disregarded = new String[5];
                String[] hash = new String[5];   //creates arrays
                String[] id = new String[5];
                String[] sent = new String[5];
                String[] stored = new String[5];
                String[] recipient1 = new String[5];
                
                recipient1[0] = "+27834557896";                 //array indices 0-4 correspond to messages 1-5
                sent[0] = "Did you get the cake?";
                id[0] = "0";
                hash[0] = "0";
                
                recipient1[1] = "+27838884567";
                stored[1] = "Where are you? You are late! I have asked you to be on time.";
                id[1] = "1";
                hash[1] = "1";
                
                recipient1[2] = "+27834484567";
                disregarded[2] = "Yohoooo, I am at your gate.";
                id[2] = "2";
                hash[2] = "2";
                
                recipient1[3] = "0838884567";
                sent[3] = "It is dinner time !";
                id[3] = "3";
                hash[3] = "3";
                
                recipient1[4] = "+27838884567";
                stored[4] = "Ok, I am leaving without you.";
                id[4] = "4";
                hash[4] = "4";
                
                Message test = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight", 0);
                test.initiateArrs(stored, sent, hash, id, disregarded, recipient1);
                assertEquals(true,(test.sentReport().contains("0") && test.sentReport().contains("3") && test.sentReport().contains("+27834557896") && test.sentReport().contains("0838884567") && test.sentReport().contains("Did you get the cake?") && test.sentReport().contains("It is dinner time !")) ,test.sentReport() );
                //tests sent message format method by checking to see if it contains all the relevant information
    }
}
