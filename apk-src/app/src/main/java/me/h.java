package me;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f28874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f28875c;

    static {
        b bVar = new b();
        f28874b = bVar;
        f28875c = new h[]{bVar, new h() { // from class: me.c
            @Override // me.h
            public final String b(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: me.d
            @Override // me.h
            public final String b(Field field) {
                return h.c(h.a(field.getName(), " "));
            }
        }, new h() { // from class: me.e
            @Override // me.h
            public final String b(Field field) {
                return h.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: me.f
            @Override // me.h
            public final String b(Field field) {
                return h.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: me.g
            @Override // me.h
            public final String b(Field field) {
                return h.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f28875c.clone();
    }

    public abstract String b(Field field);
}
