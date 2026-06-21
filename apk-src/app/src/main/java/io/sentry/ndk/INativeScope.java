package io.sentry.ndk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface INativeScope {
    void addAttachment(String str);

    void addAttachmentBytes(byte[] bArr, String str);

    void addBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    void clearAttachments();

    void removeExtra(String str);

    void removeTag(String str);

    void removeUser();

    void setExtra(String str, String str2);

    void setTag(String str, String str2);

    void setTrace(String str, String str2);

    void setUser(String str, String str2, String str3, String str4);
}
