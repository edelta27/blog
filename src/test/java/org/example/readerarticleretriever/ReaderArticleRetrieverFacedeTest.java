package org.example.readerarticleretriever;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderArticleRetrieverFacedeTest {

    @Test
    @DisplayName("should return article with id 1 and content xxx")
    public void should_return_article_with_id_1_and_content_xxx(){
        //given
        ReaderArticleRetrieverFacede facede = new ReaderArticleRetrieverFacede();
        //when
        //ArticleDto articleDto = facede.retrieveById(1);
        ArticleDto articleDto = facede.retrieveById(1L);
        //then
        assert articleDto.id().equals(1L);
        assert articleDto.content().equals("5 kroków: 1, 2, 3, 4");
        assert articleDto.header().equals("jak zostać programistą");
        assert articleDto.category().equals("IT");


    }

}