package wk;

import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.h5;
import d8.e0;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f35288a = new k();

    public static final g a(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new g("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(output, -1)));
    }

    public static final g b(int i, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) i(input, i));
        Intrinsics.checkNotNullParameter(message2, "message");
        if (i >= 0) {
            message2 = "Unexpected JSON token at offset " + i + ": " + message2;
        }
        Intrinsics.checkNotNullParameter(message2, "message");
        return new g(message2);
    }

    public static final sk.f c(sk.f descriptor, t0 module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.a(descriptor.e(), sk.h.f32935b)) {
            return descriptor.isInline() ? c(descriptor.i(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        dk.c kClass = d4.i(descriptor);
        if (kClass == null) {
            return descriptor;
        }
        b0 typeArgumentsSerializers = b0.f27475b;
        module.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return descriptor;
    }

    public static final byte d(char c8) {
        if (c8 < '~') {
            return c.f35281b[c8];
        }
        return (byte) 0;
    }

    public static final String e(sk.f fVar, vk.c json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof vk.j) {
                return ((vk.j) annotation).discriminator();
            }
        }
        return (String) json.f34873a.f20601f;
    }

    public static final void f(vk.c json, e0 sb2, qk.a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb2, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        r mode = r.f35318d;
        o[] modeReuseCache = new o[r.i.size()];
        Intrinsics.checkNotNullParameter(sb2, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new o(new ac.c(sb2), json, mode, modeReuseCache).m(serializer, obj);
    }

    public static final int g(sk.f descriptor, vk.c json, String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        hi.h hVar = json.f34873a;
        j(descriptor, json);
        int iD = descriptor.d(name);
        if (iD != -3 || !json.f34873a.f20599d) {
            return iD;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        m4.d dVar = json.f34875c;
        kotlin.text.p defaultValue = new kotlin.text.p(3, descriptor, json);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        k key = f35288a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        dVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) ((ConcurrentHashMap) dVar.f28630b).get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        Object value = obj != null ? obj : null;
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.f28630b;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(key, value);
        }
        Integer num = (Integer) ((Map) value).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final void h(d1.b bVar, String entity) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        bVar.p(bVar.f15507c - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence i(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i10 = i - 30;
                int i11 = i + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sbJ = pe.a.j(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sbJ.append(charSequence.subSequence(i10, i11).toString());
                sbJ.append(str2);
                return sbJ.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void j(sk.f fVar, vk.c json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.a(fVar.e(), sk.i.f32937b)) {
            hi.h hVar = json.f34873a;
        }
    }

    public static final r k(sk.f desc, vk.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        h5 h5VarE = desc.e();
        if (h5VarE instanceof sk.c) {
            return r.f35321g;
        }
        if (Intrinsics.a(h5VarE, sk.i.f32938c)) {
            return r.f35319e;
        }
        if (!Intrinsics.a(h5VarE, sk.i.f32939d)) {
            return r.f35318d;
        }
        sk.f keyDescriptor = c(desc.i(0), cVar.f34874b);
        h5 h5VarE2 = keyDescriptor.e();
        if ((h5VarE2 instanceof sk.e) || Intrinsics.a(h5VarE2, sk.h.f32936c)) {
            return r.f35320f;
        }
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        throw new g("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void l(d1.b bVar, Number result) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        d1.b.q(bVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String m(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }
}
