package io.sentry.ndk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NativeScope implements INativeScope {
    public static native void nativeAddAttachment(String str);

    public static native void nativeAddAttachmentBytes(byte[] bArr, String str);

    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeClearAttachments();

    public static native void nativeRemoveExtra(String str);

    public static native void nativeRemoveTag(String str);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(String str, String str2);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetTrace(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);

    @Override // io.sentry.ndk.INativeScope
    public void addAttachment(String str) {
        nativeAddAttachment(str);
    }

    @Override // io.sentry.ndk.INativeScope
    public void addAttachmentBytes(byte[] bArr, String str) {
        nativeAddAttachmentBytes(bArr, str);
    }

    @Override // io.sentry.ndk.INativeScope
    public void addBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }

    @Override // io.sentry.ndk.INativeScope
    public void clearAttachments() {
        nativeClearAttachments();
    }

    @Override // io.sentry.ndk.INativeScope
    public void removeExtra(String str) {
        nativeRemoveExtra(str);
    }

    @Override // io.sentry.ndk.INativeScope
    public void removeTag(String str) {
        nativeRemoveTag(str);
    }

    @Override // io.sentry.ndk.INativeScope
    public void removeUser() {
        nativeRemoveUser();
    }

    @Override // io.sentry.ndk.INativeScope
    public void setExtra(String str, String str2) {
        nativeSetExtra(str, str2);
    }

    @Override // io.sentry.ndk.INativeScope
    public void setTag(String str, String str2) {
        nativeSetTag(str, str2);
    }

    @Override // io.sentry.ndk.INativeScope
    public void setTrace(String str, String str2) {
        nativeSetTrace(str, str2);
    }

    @Override // io.sentry.ndk.INativeScope
    public void setUser(String str, String str2, String str3, String str4) {
        nativeSetUser(str, str2, str3, str4);
    }
}
