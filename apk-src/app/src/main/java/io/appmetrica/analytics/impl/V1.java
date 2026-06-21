package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class V1 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0573w2 f23114a;

    public V1() {
        this(new C0573w2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 fromModel(@NonNull U1 u12) {
        Y1 y1 = new Y1();
        y1.f23279a = new X1[u12.f23053a.size()];
        int i = 0;
        int i10 = 0;
        for (PermissionState permissionState : u12.f23053a) {
            X1[] x1Arr = y1.f23279a;
            X1 x12 = new X1();
            x12.f23235a = permissionState.name;
            x12.f23236b = permissionState.granted;
            x1Arr[i10] = x12;
            i10++;
        }
        C0623y2 c0623y2 = u12.f23054b;
        if (c0623y2 != null) {
            y1.f23280b = this.f23114a.fromModel(c0623y2);
        }
        y1.f23281c = new String[u12.f23055c.size()];
        Iterator it = u12.f23055c.iterator();
        while (it.hasNext()) {
            y1.f23281c[i] = (String) it.next();
            i++;
        }
        return y1;
    }

    public V1(C0573w2 c0573w2) {
        this.f23114a = c0573w2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U1 toModel(@NonNull Y1 y1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = 0;
        while (true) {
            X1[] x1Arr = y1.f23279a;
            if (i10 >= x1Arr.length) {
                break;
            }
            X1 x12 = x1Arr[i10];
            arrayList.add(new PermissionState(x12.f23235a, x12.f23236b));
            i10++;
        }
        W1 w12 = y1.f23280b;
        C0623y2 model = w12 != null ? this.f23114a.toModel(w12) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = y1.f23281c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new U1(arrayList, model, arrayList2);
            }
        }
    }
}
