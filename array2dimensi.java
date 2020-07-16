/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymultidimensi;


import javax.swing.JOptionPane;
public class array2dimensi {
   public static void main(String[] args) {
       
        System.out.println("ARRAY 2 dimensi untuk String");
        System.out.println("---------DATA BUKU---------");
        String buku[][] = {{"01", "ISLAM NUSANTARA"}, 
                              {"02", "ASWAJA"}, 
                              {"03", "KAMUS INDO-ENG"},
                              {"04", "SEJARAH"},
                              {"05", "EKONOMI"},
                              {"06", "BIOLOGI"},
                              {"06", "FISIKA"}};         
        for (int i = 0; i < buku.length; i++) {
            for (int j = 0; j < buku[0].length; j++) {
                System.out.print(buku[i][j] + " ");
            }
            System.out.println(" ");
        }
        String cari = JOptionPane.showInputDialog(null," Cari Buku berdasarkan Kode Buku");
        for (int i =0; i< buku.length; i++ ){
            for (int j =0; j < buku[0].length; j++){
                if(buku[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "Buku dengan Kode Buku " + cari+ " Ditemukan berjudul " + buku[i][j+1]);
                }
            }
        
          }
    
        }
    }
 

