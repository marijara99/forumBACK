/*
package com.solera.forum.security;

import com.solera.forum.daos.ForumUsersDAO;
import com.solera.forum.models.ForumUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
*/

/*
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private ForumUsersDAO forumUsersDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ForumUsers user = forumUsersDAO.findForumUsersByName(username);

        if (user==null){
            throw new UsernameNotFoundException("User not found");
        }

        return new CustomUserDetails(user);
    }
}
*/
