package br.com.painelcodeti.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import br.com.painelcodeti.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();
        //mText.setValue("Este é o Fragmento News");

        //TODO: Remover Mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Seleção brasileira inicia treino para o amistoso contra o Japão", "Os jogadores da seleção inciaram um treino cedo, apesar do frio intenso na capital Gaúcha, mas a força de vontyade de vencer o amistoso falou mais alto"));
        news.add(new News("Técnico da seleção Brasileira fala sobre o treino.", "Técnico Romário falou sobre a determinação dos jogadores em vencer a seleção do Japão no amistoso que está marcado para o dia 07/08/2022 às 16:00h horário de Brasília."));
        news.add(new News("Copa do Mundo 2022, veja as últimas notícias", "Fique por dentro das últimas notícias da seleção brasileira e dos locais sedes oficiais que receberão as seleções do mundo inteiro."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() { return this.news; }

}