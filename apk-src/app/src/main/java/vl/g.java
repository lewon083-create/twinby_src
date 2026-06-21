package vl;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f34912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Charset f34913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ThreadLocal f34914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34918h;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String strName = this.f34913c.name();
            gVar.getClass();
            gVar.f34913c = Charset.forName(strName);
            gVar.f34912b = l.valueOf(this.f34912b.name());
            return gVar;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final CharsetEncoder b() {
        CharsetEncoder charsetEncoderNewEncoder = this.f34913c.newEncoder();
        this.f34914d.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        this.f34915e = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
        return charsetEncoderNewEncoder;
    }
}
