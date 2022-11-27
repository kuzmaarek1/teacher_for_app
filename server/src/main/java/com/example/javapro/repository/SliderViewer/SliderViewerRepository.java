package com.example.javapro.repository.SliderViewer;

import com.example.javapro.model.CodeViewer.CodeTitle;
import com.example.javapro.model.CodeViewer.CodeViewer;
import com.example.javapro.model.SliderViewer.SliderViewer;
import com.example.javapro.model.SliderViewer.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SliderViewerRepository extends JpaRepository<SliderViewer, Long>{
    List<SliderViewer> findAllBy();
    List<SliderViewer> findAllByTitle(Title Title);
}