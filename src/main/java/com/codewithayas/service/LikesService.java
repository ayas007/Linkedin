package com.codewithayas.service;

import java.util.List;

import com.codewithayas.exception.LikeException;
import com.codewithayas.exception.TwitException;
import com.codewithayas.exception.UserException;
import com.codewithayas.model.Like;
import com.codewithayas.model.User;

public interface LikesService {
	
	public Like likeTwit(Long twitId, User user) throws UserException, TwitException;
	
	public Like unlikeTwit(Long twitId, User user) throws UserException, TwitException, LikeException;
	
	public List<Like> getAllLikes(Long twitId) throws TwitException;

}
