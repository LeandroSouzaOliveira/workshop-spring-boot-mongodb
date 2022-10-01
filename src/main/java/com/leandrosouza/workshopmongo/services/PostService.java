package com.leandrosouza.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandrosouza.workshopmongo.domain.Post;
import com.leandrosouza.workshopmongo.repository.PostRepository;
import com.leandrosouza.workshopmongo.services.excepition.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
