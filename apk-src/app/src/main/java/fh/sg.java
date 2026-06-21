package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sg implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18312a;

    public sg(sy syVar) {
        this.f18312a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rg resolve(ParsingContext parsingContext, wg wgVar, JSONObject jSONObject) {
        boolean z5 = wgVar instanceof ug;
        sy syVar = this.f18312a;
        if (z5) {
            ((xc) syVar.f18514r3.getValue()).resolve(parsingContext, ((ug) wgVar).f18698a, jSONObject);
            return new rg();
        }
        if (wgVar instanceof tg) {
            pa paVar = (pa) syVar.A2.getValue();
            qa qaVar = ((tg) wgVar).f18647a;
            paVar.getClass();
            JsonFieldResolver.resolveOptionalExpression(parsingContext, qaVar.f18158a, jSONObject, "locale", TypeHelpersKt.TYPE_HELPER_STRING);
            return new rg();
        }
        if (!(wgVar instanceof vg)) {
            throw new ij.j();
        }
        uk ukVar = (uk) syVar.H5.getValue();
        vk vkVar = ((vg) wgVar).f18776a;
        ukVar.getClass();
        return new rg();
    }
}
