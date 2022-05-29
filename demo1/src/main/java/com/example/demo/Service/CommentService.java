package com.example.demo.Service;

import com.example.demo.Modele.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final ArrayList<Comment> comment = new ArrayList<>();

    public ArrayList<Comment> getComment() {
        return this.comment;
    }
}
