package ud;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements rd.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f34460f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rd.c f34461g = new rd.c("key", pe.a.m(pe.a.l(e.class, new a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rd.c f34462h = new rd.c("value", pe.a.m(pe.a.l(e.class, new a(2))));
    public static final td.a i = new td.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f34463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f34464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f34465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rd.d f34466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f34467e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, rd.d dVar) {
        this.f34463a = byteArrayOutputStream;
        this.f34464b = map;
        this.f34465c = map2;
        this.f34466d = dVar;
    }

    public static int g(rd.c cVar) {
        e eVar = (e) ((Annotation) cVar.f32295b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f34456a;
        }
        throw new rd.b("Field has no @Protobuf config");
    }

    @Override // rd.e
    public final rd.e a(rd.c cVar, long j10) throws IOException {
        if (j10 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f32295b.get(e.class));
        if (eVar == null) {
            throw new rd.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f34456a << 3);
        i(j10);
        return this;
    }

    @Override // rd.e
    public final rd.e b(rd.c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    @Override // rd.e
    public final rd.e c(rd.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void d(rd.c cVar, int i10, boolean z5) {
        if (z5 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f32295b.get(e.class));
        if (eVar == null) {
            throw new rd.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f34456a << 3);
        h(i10);
    }

    public final void e(rd.c cVar, Object obj, boolean z5) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f34460f);
            h(bytes.length);
            this.f34463a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z5 && dDoubleValue == ConfigValue.DOUBLE_DEFAULT_VALUE) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f34463a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z5 && fFloatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f34463a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z5 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f32295b.get(e.class));
            if (eVar == null) {
                throw new rd.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f34456a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z5 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f34463a.write(bArr);
            return;
        }
        rd.d dVar = (rd.d) this.f34464b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z5);
            return;
        }
        rd.f fVar = (rd.f) this.f34465c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f34467e;
            hVar.f34469a = false;
            hVar.f34471c = cVar;
            hVar.f34470b = z5;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            d(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f34466d, cVar, obj, z5);
        }
    }

    public final void f(rd.d dVar, rd.c cVar, Object obj, boolean z5) throws IOException {
        b bVar = new b();
        bVar.f34457b = 0L;
        try {
            OutputStream outputStream = this.f34463a;
            this.f34463a = bVar;
            try {
                dVar.a(obj, this);
                this.f34463a = outputStream;
                long j10 = bVar.f34457b;
                bVar.close();
                if (z5 && j10 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j10);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f34463a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f34463a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f34463a.write(i10 & 127);
    }

    public final void i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f34463a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f34463a.write(((int) j10) & 127);
    }
}
