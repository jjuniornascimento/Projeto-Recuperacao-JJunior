package com.ifpb.snct;


import com.ifpb.snct.SnctSqlOh;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SnctDao {
	private SnctSqlOh helper;
	
	public SnctDao(Context ctx){
		
		helper = new SnctSqlOh(ctx);
	}
	
	public void inserir(SnctClass tbavaliacao){
		
		SQLiteDatabase bd = helper.getWritableDatabase();
		
		ContentValues valor = new ContentValues();
		
		valor.put(SnctSqlOh.NOME_AVALIADOR,tbavaliacao.getNome_avaliador());
		valor.put(SnctSqlOh.TITULO_TRABALHO,tbavaliacao.getTitulo_trabalho());
		valor.put(SnctSqlOh.NOTA,tbavaliacao.getNota());
		valor.put(SnctSqlOh.COMENTATIO,tbavaliacao.getComentario());
		
		
		bd.insert(SnctSqlOh.TB_AVALIACAO, null, valor);
		
		bd.close();
		
	}
}