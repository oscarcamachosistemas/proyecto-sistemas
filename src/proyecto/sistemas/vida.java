/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.sistemas;

/**
 *
 * @author Casa
 */
public class vida extends Casilla{
    
    @Override
    public void SetCasilla (String A){
        super.ValorImpresion = "";
    }
    
    @Override
    public String getCasilla (){
        return super.ValorUmpresion;
    }
    
}
