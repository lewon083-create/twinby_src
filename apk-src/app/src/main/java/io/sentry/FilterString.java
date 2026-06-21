package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FilterString {

    @NotNull
    private final String filterString;

    @Nullable
    private final Pattern pattern;

    public FilterString(@NotNull String str) {
        Pattern patternCompile;
        this.filterString = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            Sentry.getCurrentScopes().getOptions().getLogger().log(SentryLevel.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.pattern = patternCompile;
    }

    public boolean equals(Object obj) {
        if (obj == null || FilterString.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.filterString, ((FilterString) obj).filterString);
    }

    @NotNull
    public String getFilterString() {
        return this.filterString;
    }

    public int hashCode() {
        return Objects.hash(this.filterString);
    }

    public boolean matches(String str) {
        Pattern pattern = this.pattern;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }
}
