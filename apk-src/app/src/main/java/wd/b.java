package wd;

import android.util.Base64OutputStream;
import ek.o;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f35234c;

    public /* synthetic */ b(c cVar, int i) {
        this.f35233b = i;
        this.f35234c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f35233b) {
            case 0:
                c cVar = this.f35234c;
                synchronized (cVar) {
                    try {
                        i iVar = (i) cVar.f35235a.get();
                        ArrayList arrayListA = iVar.a();
                        synchronized (iVar) {
                            iVar.f35248a.a(new o(9, iVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            a aVar = (a) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f35231a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f35232b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th3) {
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return string;
            default:
                c cVar2 = this.f35234c;
                synchronized (cVar2) {
                    final i iVar2 = (i) cVar2.f35235a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strA = ((fe.b) cVar2.f35237c.get()).a();
                    synchronized (iVar2) {
                        final String strB = iVar2.b(jCurrentTimeMillis);
                        final t2.e eVarB = ya.e.B(strA);
                        iVar2.f35248a.a(new Function1() { // from class: wd.h
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
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Object obj2;
                                i iVar3 = iVar2;
                                String str = strB;
                                String str2 = strA;
                                t2.e key = eVarB;
                                t2.b bVar = (t2.b) obj;
                                Object obj3 = null;
                                if (((String) a0.e.h(bVar, i.f35247d, "")).equals(str)) {
                                    t2.e eVarC = iVar3.c(bVar, str);
                                    if (eVarC == null || eVarC.f33403a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (iVar3) {
                                        iVar3.d(bVar, str);
                                        HashSet hashSet = new HashSet((Collection) a0.e.h(bVar, key, new HashSet()));
                                        hashSet.add(str);
                                        Intrinsics.checkNotNullParameter(key, "key");
                                        bVar.f(key, hashSet);
                                    }
                                    return null;
                                }
                                t2.e eVar = i.f35246c;
                                long jLongValue = ((Long) a0.e.h(bVar, eVar, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (iVar3) {
                                        try {
                                            long jLongValue2 = ((Long) a0.e.h(bVar, eVar, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : bVar.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((t2.e) entry.getKey()).f33403a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            t2.e key2 = ya.e.B(str3);
                                            Intrinsics.checkNotNullParameter(key2, "key");
                                            bVar.f(key2, hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            bVar.e(i.f35246c, Long.valueOf(jLongValue));
                                        } catch (Throwable th5) {
                                            throw th5;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) a0.e.h(bVar, key, new HashSet()));
                                hashSet4.add(str);
                                Intrinsics.checkNotNullParameter(key, "key");
                                bVar.f(key, hashSet4);
                                bVar.e(i.f35246c, Long.valueOf(jLongValue + 1));
                                bVar.e(i.f35247d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
