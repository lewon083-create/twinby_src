package bf;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ii.n f2127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi.g f2128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f2129e;

    public /* synthetic */ k(e eVar, ii.n nVar, hi.g gVar) {
        this.f2126b = 6;
        this.f2129e = eVar;
        this.f2127c = nVar;
        this.f2128d = gVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2126b;
        final int i10 = 3;
        final int i11 = 2;
        final int i12 = 1;
        final int i13 = 0;
        hi.g gVar = this.f2128d;
        ii.n nVar = this.f2127c;
        final e eVar = this.f2129e;
        switch (i) {
            case 0:
                HashMap map = m.f2137d;
                final cf.b bVar = new cf.b(nVar, gVar);
                eVar.m(bVar, new Runnable() { // from class: bf.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i13) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map2 = eVar2.f2102g;
                                cf.b bVar2 = bVar;
                                ii.n nVar2 = bVar2.f2273g;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (a.a(eVar2.f2099d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(eVar2.i());
                                    sb2.append("cursor ");
                                    sb2.append(iIntValue);
                                    sb2.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb2.toString());
                                }
                                j jVar = null;
                                if (zEquals) {
                                    j jVar2 = (j) map2.get(num);
                                    if (jVar2 != null) {
                                        eVar2.c(jVar2);
                                    }
                                    bVar2.success(null);
                                    return;
                                }
                                j jVar3 = (j) map2.get(num);
                                boolean z5 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f2125c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(jVar3.f2124b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar2.success(mapD);
                                        if (z5) {
                                            return;
                                        }
                                        eVar2.c(jVar3);
                                        return;
                                    } catch (Exception e3) {
                                        eVar2.j(e3, bVar2);
                                        if (jVar3 != null) {
                                            eVar2.c(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar2.c(jVar);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar2.c(jVar3);
                                    }
                                    throw th2;
                                }
                            case 1:
                                eVar.f(bVar);
                                return;
                            case 2:
                                eVar.g(bVar);
                                return;
                            case 3:
                                eVar.e(bVar);
                                return;
                            default:
                                cf.b bVar3 = bVar;
                                Object objT = bVar3.t("inTransaction");
                                Boolean bool = objT instanceof Boolean ? (Boolean) objT : null;
                                boolean z10 = Boolean.TRUE.equals(bool) && bVar3.B() && ((Integer) bVar3.t("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z10) {
                                    int i14 = eVar3.f2105k + 1;
                                    eVar3.f2105k = i14;
                                    eVar3.f2106l = Integer.valueOf(i14);
                                }
                                if (!eVar3.h(bVar3)) {
                                    if (z10) {
                                        eVar3.f2106l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap map3 = new HashMap();
                                    map3.put("transactionId", eVar3.f2106l);
                                    bVar3.success(map3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f2106l = null;
                                    }
                                    bVar3.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap map2 = m.f2137d;
                final cf.b bVar2 = new cf.b(nVar, gVar);
                eVar.m(bVar2, new Runnable() { // from class: bf.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i10) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map22 = eVar2.f2102g;
                                cf.b bVar22 = bVar2;
                                ii.n nVar2 = bVar22.f2273g;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (a.a(eVar2.f2099d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(eVar2.i());
                                    sb2.append("cursor ");
                                    sb2.append(iIntValue);
                                    sb2.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb2.toString());
                                }
                                j jVar = null;
                                if (zEquals) {
                                    j jVar2 = (j) map22.get(num);
                                    if (jVar2 != null) {
                                        eVar2.c(jVar2);
                                    }
                                    bVar22.success(null);
                                    return;
                                }
                                j jVar3 = (j) map22.get(num);
                                boolean z5 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f2125c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(jVar3.f2124b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar22.success(mapD);
                                        if (z5) {
                                            return;
                                        }
                                        eVar2.c(jVar3);
                                        return;
                                    } catch (Exception e3) {
                                        eVar2.j(e3, bVar22);
                                        if (jVar3 != null) {
                                            eVar2.c(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar2.c(jVar);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar2.c(jVar3);
                                    }
                                    throw th2;
                                }
                            case 1:
                                eVar.f(bVar2);
                                return;
                            case 2:
                                eVar.g(bVar2);
                                return;
                            case 3:
                                eVar.e(bVar2);
                                return;
                            default:
                                cf.b bVar3 = bVar2;
                                Object objT = bVar3.t("inTransaction");
                                Boolean bool = objT instanceof Boolean ? (Boolean) objT : null;
                                boolean z10 = Boolean.TRUE.equals(bool) && bVar3.B() && ((Integer) bVar3.t("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z10) {
                                    int i14 = eVar3.f2105k + 1;
                                    eVar3.f2105k = i14;
                                    eVar3.f2106l = Integer.valueOf(i14);
                                }
                                if (!eVar3.h(bVar3)) {
                                    if (z10) {
                                        eVar3.f2106l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap map3 = new HashMap();
                                    map3.put("transactionId", eVar3.f2106l);
                                    bVar3.success(map3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f2106l = null;
                                    }
                                    bVar3.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap map3 = m.f2137d;
                final cf.b bVar3 = new cf.b(nVar, gVar);
                eVar.m(bVar3, new Runnable() { // from class: bf.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i12) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map22 = eVar2.f2102g;
                                cf.b bVar22 = bVar3;
                                ii.n nVar2 = bVar22.f2273g;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (a.a(eVar2.f2099d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(eVar2.i());
                                    sb2.append("cursor ");
                                    sb2.append(iIntValue);
                                    sb2.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb2.toString());
                                }
                                j jVar = null;
                                if (zEquals) {
                                    j jVar2 = (j) map22.get(num);
                                    if (jVar2 != null) {
                                        eVar2.c(jVar2);
                                    }
                                    bVar22.success(null);
                                    return;
                                }
                                j jVar3 = (j) map22.get(num);
                                boolean z5 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f2125c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(jVar3.f2124b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar22.success(mapD);
                                        if (z5) {
                                            return;
                                        }
                                        eVar2.c(jVar3);
                                        return;
                                    } catch (Exception e3) {
                                        eVar2.j(e3, bVar22);
                                        if (jVar3 != null) {
                                            eVar2.c(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar2.c(jVar);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar2.c(jVar3);
                                    }
                                    throw th2;
                                }
                            case 1:
                                eVar.f(bVar3);
                                return;
                            case 2:
                                eVar.g(bVar3);
                                return;
                            case 3:
                                eVar.e(bVar3);
                                return;
                            default:
                                cf.b bVar32 = bVar3;
                                Object objT = bVar32.t("inTransaction");
                                Boolean bool = objT instanceof Boolean ? (Boolean) objT : null;
                                boolean z10 = Boolean.TRUE.equals(bool) && bVar32.B() && ((Integer) bVar32.t("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z10) {
                                    int i14 = eVar3.f2105k + 1;
                                    eVar3.f2105k = i14;
                                    eVar3.f2106l = Integer.valueOf(i14);
                                }
                                if (!eVar3.h(bVar32)) {
                                    if (z10) {
                                        eVar3.f2106l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap map32 = new HashMap();
                                    map32.put("transactionId", eVar3.f2106l);
                                    bVar32.success(map32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f2106l = null;
                                    }
                                    bVar32.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap map4 = m.f2137d;
                try {
                    eVar.i.setLocale(Locale.forLanguageTag((String) nVar.a("locale")));
                    gVar.success(null);
                } catch (Exception e3) {
                    gVar.b("sqlite_error", "Error calling setLocale: " + e3.getMessage(), null);
                    return;
                }
                break;
            case 4:
                HashMap map5 = m.f2137d;
                final cf.b bVar4 = new cf.b(nVar, gVar);
                final int i14 = 4;
                eVar.m(bVar4, new Runnable() { // from class: bf.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i14) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map22 = eVar2.f2102g;
                                cf.b bVar22 = bVar4;
                                ii.n nVar2 = bVar22.f2273g;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (a.a(eVar2.f2099d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(eVar2.i());
                                    sb2.append("cursor ");
                                    sb2.append(iIntValue);
                                    sb2.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb2.toString());
                                }
                                j jVar = null;
                                if (zEquals) {
                                    j jVar2 = (j) map22.get(num);
                                    if (jVar2 != null) {
                                        eVar2.c(jVar2);
                                    }
                                    bVar22.success(null);
                                    return;
                                }
                                j jVar3 = (j) map22.get(num);
                                boolean z5 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f2125c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(jVar3.f2124b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar22.success(mapD);
                                        if (z5) {
                                            return;
                                        }
                                        eVar2.c(jVar3);
                                        return;
                                    } catch (Exception e32) {
                                        eVar2.j(e32, bVar22);
                                        if (jVar3 != null) {
                                            eVar2.c(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar2.c(jVar);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar2.c(jVar3);
                                    }
                                    throw th2;
                                }
                            case 1:
                                eVar.f(bVar4);
                                return;
                            case 2:
                                eVar.g(bVar4);
                                return;
                            case 3:
                                eVar.e(bVar4);
                                return;
                            default:
                                cf.b bVar32 = bVar4;
                                Object objT = bVar32.t("inTransaction");
                                Boolean bool = objT instanceof Boolean ? (Boolean) objT : null;
                                boolean z10 = Boolean.TRUE.equals(bool) && bVar32.B() && ((Integer) bVar32.t("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z10) {
                                    int i142 = eVar3.f2105k + 1;
                                    eVar3.f2105k = i142;
                                    eVar3.f2106l = Integer.valueOf(i142);
                                }
                                if (!eVar3.h(bVar32)) {
                                    if (z10) {
                                        eVar3.f2106l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap map32 = new HashMap();
                                    map32.put("transactionId", eVar3.f2106l);
                                    bVar32.success(map32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f2106l = null;
                                    }
                                    bVar32.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap map6 = m.f2137d;
                final cf.b bVar5 = new cf.b(nVar, gVar);
                eVar.m(bVar5, new Runnable() { // from class: bf.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i11) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map22 = eVar2.f2102g;
                                cf.b bVar22 = bVar5;
                                ii.n nVar2 = bVar22.f2273g;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (a.a(eVar2.f2099d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(eVar2.i());
                                    sb2.append("cursor ");
                                    sb2.append(iIntValue);
                                    sb2.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb2.toString());
                                }
                                j jVar = null;
                                if (zEquals) {
                                    j jVar2 = (j) map22.get(num);
                                    if (jVar2 != null) {
                                        eVar2.c(jVar2);
                                    }
                                    bVar22.success(null);
                                    return;
                                }
                                j jVar3 = (j) map22.get(num);
                                boolean z5 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f2125c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(jVar3.f2124b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar22.success(mapD);
                                        if (z5) {
                                            return;
                                        }
                                        eVar2.c(jVar3);
                                        return;
                                    } catch (Exception e32) {
                                        eVar2.j(e32, bVar22);
                                        if (jVar3 != null) {
                                            eVar2.c(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar2.c(jVar);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar2.c(jVar3);
                                    }
                                    throw th2;
                                }
                            case 1:
                                eVar.f(bVar5);
                                return;
                            case 2:
                                eVar.g(bVar5);
                                return;
                            case 3:
                                eVar.e(bVar5);
                                return;
                            default:
                                cf.b bVar32 = bVar5;
                                Object objT = bVar32.t("inTransaction");
                                Boolean bool = objT instanceof Boolean ? (Boolean) objT : null;
                                boolean z10 = Boolean.TRUE.equals(bool) && bVar32.B() && ((Integer) bVar32.t("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z10) {
                                    int i142 = eVar3.f2105k + 1;
                                    eVar3.f2105k = i142;
                                    eVar3.f2106l = Integer.valueOf(i142);
                                }
                                if (!eVar3.h(bVar32)) {
                                    if (z10) {
                                        eVar3.f2106l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap map32 = new HashMap();
                                    map32.put("transactionId", eVar3.f2106l);
                                    bVar32.success(map32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f2106l = null;
                                    }
                                    bVar32.success(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap map7 = m.f2137d;
                Boolean bool = Boolean.TRUE;
                boolean zEquals = bool.equals(nVar.a("noResult"));
                boolean zEquals2 = bool.equals(nVar.a("continueOnError"));
                List list = (List) nVar.a("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cf.a aVar = new cf.a((Map) it.next(), zEquals);
                    String strX = aVar.x();
                    strX.getClass();
                    byte b2 = -1;
                    switch (strX.hashCode()) {
                        case -1319569547:
                            if (strX.equals("execute")) {
                                b2 = 0;
                            }
                            break;
                        case -1183792455:
                            if (strX.equals("insert")) {
                                b2 = 1;
                            }
                            break;
                        case -838846263:
                            if (strX.equals("update")) {
                                b2 = 2;
                            }
                            break;
                        case 107944136:
                            if (strX.equals("query")) {
                                b2 = 3;
                            }
                            break;
                    }
                    s7.g gVar2 = aVar.f2270g;
                    switch (b2) {
                        case 0:
                            if (eVar.h(aVar)) {
                                aVar.success(null);
                                aVar.a0(arrayList);
                            } else if (!zEquals2) {
                                gVar.b((String) gVar2.f32796c, (String) gVar2.f32797d, gVar2.f32798e);
                            } else {
                                aVar.Z(arrayList);
                            }
                            break;
                        case 1:
                            if (eVar.e(aVar)) {
                                aVar.a0(arrayList);
                            } else if (!zEquals2) {
                                gVar.b((String) gVar2.f32796c, (String) gVar2.f32797d, gVar2.f32798e);
                            } else {
                                aVar.Z(arrayList);
                            }
                            break;
                        case 2:
                            if (eVar.g(aVar)) {
                                aVar.a0(arrayList);
                            } else if (!zEquals2) {
                                gVar.b((String) gVar2.f32796c, (String) gVar2.f32797d, gVar2.f32798e);
                            } else {
                                aVar.Z(arrayList);
                            }
                            break;
                        case 3:
                            if (eVar.f(aVar)) {
                                aVar.a0(arrayList);
                            } else if (!zEquals2) {
                                gVar.b((String) gVar2.f32796c, (String) gVar2.f32797d, gVar2.f32798e);
                            } else {
                                aVar.Z(arrayList);
                            }
                            break;
                        default:
                            gVar.b("bad_param", pe.a.f("Batch method '", strX, "' not supported"), null);
                            break;
                    }
                }
                if (!zEquals) {
                    gVar.success(arrayList);
                } else {
                    gVar.success(null);
                }
                break;
        }
    }

    public /* synthetic */ k(ii.n nVar, e eVar, hi.g gVar) {
        this.f2126b = 3;
        this.f2127c = nVar;
        this.f2129e = eVar;
        this.f2128d = gVar;
    }

    public /* synthetic */ k(ii.n nVar, hi.g gVar, e eVar, int i) {
        this.f2126b = i;
        this.f2127c = nVar;
        this.f2128d = gVar;
        this.f2129e = eVar;
    }
}
