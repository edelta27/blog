package org.example.readerarticleretriever;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderArticleRetrieverFacedeTest {

    @Test
    public void f(){
        //given
        ReaderArticleRetrieverFacede facede = new ReaderArticleRetrieverFacede();
        //when
        //ArticleDto articleDto = facede.retrieveById(1);
        ArticleDto articleDto = facede.retrieveById(1L);
        //then


    }

}