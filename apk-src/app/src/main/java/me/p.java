package me;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public final s a() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public long c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            re.c cVar = new re.c(stringWriter);
            cVar.f32317f = true;
            com.google.gson.internal.bind.p.A.getClass();
            com.google.gson.internal.bind.l.d(cVar, this);
            return stringWriter.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
