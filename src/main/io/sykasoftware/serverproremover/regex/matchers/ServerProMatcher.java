package io.sykasoftware.serverproremover.regex.matchers;

import io.sykasoftware.serverproremover.regex.Matcher;

public class ServerProMatcher implements Matcher
{
    public boolean matches(String string)
    {
        return string.matches("^.*Server.*\\.pro$");
    }
}
