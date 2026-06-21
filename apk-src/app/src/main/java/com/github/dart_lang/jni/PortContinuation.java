package com.github.dart_lang.jni;

import hk.k0;
import kotlin.coroutines.CoroutineContext;
import ok.d;
import ok.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class PortContinuation<T> implements mj.a {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j10) {
        this.port = j10;
    }

    private native void _resumeWith(long j10, Object obj);

    @Override // mj.a
    public CoroutineContext getContext() {
        e eVar = k0.f20682a;
        return d.f30722d;
    }

    @Override // mj.a
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
