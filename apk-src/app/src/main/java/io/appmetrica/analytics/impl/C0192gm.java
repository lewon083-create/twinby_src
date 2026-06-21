package io.appmetrica.analytics.impl;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0192gm implements InterfaceC0269jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C0140em f23943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f23944b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0269jm
    public final void a(@NotNull C0140em c0140em) {
        this.f23943a = c0140em;
        Iterator it = this.f23944b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0269jm) it.next()).a(c0140em);
        }
    }

    @NotNull
    public final C0140em b() {
        C0140em c0140em = this.f23943a;
        if (c0140em != null) {
            return c0140em;
        }
        Intrinsics.g("startupState");
        throw null;
    }

    public final void b(@NotNull InterfaceC0269jm interfaceC0269jm) {
        this.f23944b.remove(interfaceC0269jm);
    }

    public final void a(@NotNull InterfaceC0269jm interfaceC0269jm) {
        this.f23944b.add(interfaceC0269jm);
        if (this.f23943a != null) {
            C0140em c0140em = this.f23943a;
            if (c0140em != null) {
                interfaceC0269jm.a(c0140em);
            } else {
                Intrinsics.g("startupState");
                throw null;
            }
        }
    }

    public final void a(@NotNull Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageCreate = ((Qm) Om.a(C0243im.class)).create(context);
        vo voVarA = C0382oa.k().D().a();
        synchronized (voVarA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(voVarA.f24950a.a(), VKApiCodes.PARAM_DEVICE_ID);
        }
        a(new C0140em(strOptStringOrNull, voVarA.a(), (C0243im) protobufStateStorageCreate.read()));
    }
}
