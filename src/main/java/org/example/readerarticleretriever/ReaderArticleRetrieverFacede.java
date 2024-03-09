package org.example.readerarticleretriever;

public class ReaderArticleRetrieverFacede {

    public ArticleDto retrieveById(Long id){
       // return new ArticleDto(
       //         1L,
       //         "jak zostać programistą",
       //         "5 kroków: 1, 2, 3, 4",
       //         "IT"
       // );
        return ArticleDto.builder()
                .content("5 kroków: 1, 2, 3, 4")
                .header("jak zostać programistą")
                .id(1L)
                .category("IT")
                .build();

    }

}
