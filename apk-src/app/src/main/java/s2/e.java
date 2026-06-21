package s2;

import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z {
    private static final e DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private o0 preferences_ = o0.f1453c;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.j(e.class, eVar);
    }

    public static o0 l(e eVar) {
        o0 o0Var = eVar.preferences_;
        if (!o0Var.f1454b) {
            eVar.preferences_ = o0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((x) DEFAULT_INSTANCE.c(5));
    }

    public static e o(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.j jVar = new androidx.datastore.preferences.protobuf.j(fileInputStream);
        q qVarA = q.a();
        z zVarI = eVar.i();
        try {
            z0 z0Var = z0.f1519c;
            z0Var.getClass();
            c1 c1VarA = z0Var.a(zVarI.getClass());
            l lVar = (l) jVar.f1433b;
            if (lVar == null) {
                lVar = new l(jVar);
            }
            c1VarA.h(zVarI, lVar, qVarA);
            c1VarA.c(zVarI);
            if (z.f(zVarI, true)) {
                return (e) zVarI;
            }
            throw new e0(new i1().getMessage());
        } catch (e0 e3) {
            if (e3.f1377b) {
                throw new e0(e3.getMessage(), e3);
            }
            throw e3;
        } catch (i1 e7) {
            throw new e0(e7.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof e0) {
                throw ((e0) e10.getCause());
            }
            throw new e0(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof e0) {
                throw ((e0) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object c(int i) {
        x0 yVar;
        switch (t.z.m(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f32426a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (e.class) {
                    try {
                        yVar = PARSER;
                        if (yVar == null) {
                            yVar = new y();
                            PARSER = yVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return yVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
