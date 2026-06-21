package io.sentry;

import io.sentry.protocol.ViewHierarchy;
import java.io.File;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Attachment {
    private static final String DEFAULT_ATTACHMENT_TYPE = "event.attachment";
    private static final String VIEW_HIERARCHY_ATTACHMENT_TYPE = "event.view_hierarchy";
    private final boolean addToTransactions;

    @Nullable
    private String attachmentType;

    @Nullable
    private final Callable<byte[]> byteProvider;

    @Nullable
    private byte[] bytes;

    @Nullable
    private final String contentType;

    @NotNull
    private final String filename;

    @Nullable
    private String pathname;

    @Nullable
    private final JsonSerializable serializable;

    public Attachment(@NotNull byte[] bArr, @NotNull String str) {
        this(bArr, str, (String) null);
    }

    @NotNull
    public static Attachment fromByteProvider(@NotNull Callable<byte[]> callable, @NotNull String str, @Nullable String str2, boolean z5) {
        return new Attachment(callable, str, str2, DEFAULT_ATTACHMENT_TYPE, z5);
    }

    @NotNull
    public static Attachment fromScreenshot(byte[] bArr) {
        return new Attachment(bArr, "screenshot.png", "image/png", false);
    }

    @NotNull
    public static Attachment fromThreadDump(byte[] bArr) {
        return new Attachment(bArr, "thread-dump.txt", "text/plain", false);
    }

    @NotNull
    public static Attachment fromViewHierarchy(ViewHierarchy viewHierarchy) {
        return new Attachment((JsonSerializable) viewHierarchy, "view-hierarchy.json", "application/json", VIEW_HIERARCHY_ATTACHMENT_TYPE, false);
    }

    @Nullable
    public String getAttachmentType() {
        return this.attachmentType;
    }

    @Nullable
    public Callable<byte[]> getByteProvider() {
        return this.byteProvider;
    }

    @Nullable
    public byte[] getBytes() {
        return this.bytes;
    }

    @Nullable
    public String getContentType() {
        return this.contentType;
    }

    @NotNull
    public String getFilename() {
        return this.filename;
    }

    @Nullable
    public String getPathname() {
        return this.pathname;
    }

    @Nullable
    public JsonSerializable getSerializable() {
        return this.serializable;
    }

    public boolean isAddToTransactions() {
        return this.addToTransactions;
    }

    public Attachment(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2) {
        this(bArr, str, str2, false);
    }

    public Attachment(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, boolean z5) {
        this(bArr, str, str2, DEFAULT_ATTACHMENT_TYPE, z5);
    }

    public Attachment(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z5) {
        this.bytes = bArr;
        this.serializable = null;
        this.byteProvider = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z5;
    }

    public Attachment(@NotNull JsonSerializable jsonSerializable, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z5) {
        this.bytes = null;
        this.serializable = jsonSerializable;
        this.byteProvider = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z5;
    }

    public Attachment(@NotNull Callable<byte[]> callable, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z5) {
        this.bytes = null;
        this.serializable = null;
        this.byteProvider = callable;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z5;
    }

    public Attachment(@NotNull String str) {
        this(str, new File(str).getName());
    }

    public Attachment(@NotNull String str, @NotNull String str2) {
        this(str, str2, (String) null);
    }

    public Attachment(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(str, str2, str3, DEFAULT_ATTACHMENT_TYPE, false);
    }

    public Attachment(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z5) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.attachmentType = str4;
        this.addToTransactions = z5;
    }

    public Attachment(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z5) {
        this.attachmentType = DEFAULT_ATTACHMENT_TYPE;
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.addToTransactions = z5;
    }

    public Attachment(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z5, @Nullable String str4) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.addToTransactions = z5;
        this.attachmentType = str4;
    }
}
