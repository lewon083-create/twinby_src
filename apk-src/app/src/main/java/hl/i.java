package hl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20746c;

    public i(ArrayList protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.f20744a = protocols;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.a(name, "supports") && Intrinsics.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.a(name, "unsupported") && Intrinsics.a(Void.TYPE, returnType)) {
            this.f20745b = true;
            return null;
        }
        boolean zA = Intrinsics.a(name, "protocols");
        ArrayList arrayList = this.f20744a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((Intrinsics.a(name, "selectProtocol") || Intrinsics.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj2 = list.get(i);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f20746c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f20746c = str2;
                return str2;
            }
        }
        if ((!Intrinsics.a(name, "protocolSelected") && !Intrinsics.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f20746c = (String) obj3;
        return null;
    }
}
