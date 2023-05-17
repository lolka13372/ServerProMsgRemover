package io.sykasoftware.serverproremover.regex;

import io.sykasoftware.serverproremover.regex.matchers.ServerProMatcher;

public interface Matcher {
	boolean matches(String string);

	static final Matcher[] matchers = new Matcher[]
	{
		new ServerProMatcher()
	};

	public static boolean matchesAny(String string)
	{
		for (Matcher matcher : matchers)
		{
			if (matcher.matches(string))
			{
				return true;
			}
		}
		return false;
	}
}
