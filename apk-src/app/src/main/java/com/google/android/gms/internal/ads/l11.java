package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Optional f7374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Optional f7375b;

    public final boolean a(mg mgVar) {
        byte[] bArrD = mgVar.z().A().A().D();
        byte[] bArrD2 = mgVar.z().C().D();
        try {
            try {
                if (this.f7374a == null && this.f7375b == null) {
                    try {
                        kk1.a();
                        l91 l91VarE = vv.e(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=")));
                        be1 be1Var = be1.f3766d;
                        this.f7374a = Optional.of((q91) l91VarE.A(be1Var, q91.class));
                        this.f7375b = Optional.of((q91) vv.e(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).A(be1Var, q91.class));
                    } catch (Exception e3) {
                        throw new GeneralSecurityException("Failed to verify program", e3);
                    }
                }
                this.f7374a.isPresent();
                ((q91) this.f7374a.get()).a(bArrD, bArrD2);
                return true;
            } catch (GeneralSecurityException unused) {
                this.f7375b.isPresent();
                ((q91) this.f7375b.get()).a(bArrD, bArrD2);
                return true;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
