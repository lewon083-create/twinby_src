package io.flutter.plugin.editing;

import a0.b1;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import ii.q;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import xh.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends BaseInputConnection implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f25624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3.e f25626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f25627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditorInfo f25628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f25629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f25631h;
    public final ExtractedText i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputMethodManager f25632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DynamicLayout f25633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b1 f25634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u7.f f25635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25636n;

    public c(s sVar, int i, h3.e eVar, u7.f fVar, f fVar2, EditorInfo editorInfo) {
        FlutterJNI flutterJNI = new FlutterJNI();
        super(sVar, true);
        this.f25630g = false;
        this.i = new ExtractedText();
        this.f25636n = 0;
        this.f25624a = sVar;
        this.f25625b = i;
        this.f25626c = eVar;
        this.f25627d = fVar2;
        fVar2.a(this);
        this.f25628e = editorInfo;
        this.f25635m = fVar;
        this.f25634l = new b1(21, flutterJNI);
        this.f25633k = new DynamicLayout(fVar2, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f25632j = (InputMethodManager) sVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z5) {
        f fVar = this.f25627d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        InputMethodManager inputMethodManager = this.f25632j;
        s sVar = this.f25624a;
        inputMethodManager.updateSelection(sVar, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        ExtractedTextRequest extractedTextRequest = this.f25629f;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(sVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f25630g) {
            inputMethodManager.updateCursorAnchorInfo(sVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f25631h;
        if (builder == null) {
            this.f25631h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f25631h;
        f fVar = this.f25627d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f25631h.setComposingText(-1, "");
        } else {
            this.f25631h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f25631h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f25627d.b();
        this.f25636n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence string = this.f25627d;
        string.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(string);
        string.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(string);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            string = string.toString();
        }
        extractedText.text = string;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f25627d.e(this);
        while (this.f25636n > 0) {
            endBatchEdit();
            this.f25636n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        int i10;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f25624a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i10 = inputStreamOpenInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i10 = -1;
                                    }
                                    if (i10 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap map = new HashMap();
                                        map.put("mimeType", mimeType);
                                        map.put("data", byteArray);
                                        map.put("uri", contentUri.toString());
                                        ((q) this.f25626c.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f25625b), "TextInputAction.commitContent", map), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0285, code lost:
    
        r14 = r14 + r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0040 A[ADDED_TO_REGION, EDGE_INSN: B:197:0x0040->B:18:0x0040 BREAK  A[LOOP:2: B:63:0x00fb->B:200:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01ab A[ADDED_TO_REGION, EDGE_INSN: B:205:0x01ab->B:108:0x01ab BREAK  A[LOOP:4: B:143:0x022c->B:210:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.c.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        f fVar = this.f25627d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i10);
    }

    public final boolean e(boolean z5, boolean z10) {
        f fVar = this.f25627d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z11 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z10) {
            z11 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f25633k;
        if (z11) {
            if (z5) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z5) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f25636n--;
        this.f25627d.c();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f25627d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.f25629f = (i & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean z5 = true;
        f fVar = this.f25627d;
        if (i == 16908319) {
            setSelection(0, fVar.length());
        } else {
            s sVar = this.f25624a;
            if (i == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) sVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(iMin, iMax)));
                    fVar.delete(iMin, iMax);
                    setSelection(iMin, iMin);
                }
            } else if (i == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) sVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i == 16908322) {
                ClipData primaryClip = ((ClipboardManager) sVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(sVar.getContext());
                    int iMax2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        fVar.delete(iMin2, iMax4);
                    }
                    fVar.insert(iMin2, charSequenceCoerceToText);
                    int length = charSequenceCoerceToText.length() + iMin2;
                    setSelection(length, length);
                }
            } else {
                z5 = false;
            }
        }
        endBatchEdit();
        return z5;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i10 = this.f25625b;
        h3.e eVar = this.f25626c;
        if (i == 0) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.unspecified"), null);
        } else if (i == 1) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.newline"), null);
        } else if (i == 2) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.go"), null);
        } else if (i == 3) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.search"), null);
        } else if (i == 4) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.send"), null);
        } else if (i == 5) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.next"), null);
        } else if (i != 7) {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.done"), null);
        } else {
            ((q) eVar.f20375c).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        h3.e eVar = this.f25626c;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        ((q) eVar.f20375c).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f25625b), map), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.f25632j.updateCursorAnchorInfo(this.f25624a, b());
        }
        this.f25630g = (i & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f25635m.n(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i10) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i10);
        endBatchEdit();
        return selection;
    }
}
