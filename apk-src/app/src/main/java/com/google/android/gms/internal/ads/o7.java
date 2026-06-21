package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8622a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8625d;

    static {
        String str = cq0.f4293a;
        Locale locale = Locale.US;
        f8623b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f8624c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f8625d = Pattern.compile("\\\\an(\\d+)");
    }
}
