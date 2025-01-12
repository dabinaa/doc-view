package com.liuzhihang.doc.view.facade;

import com.liuzhihang.doc.view.facade.dto.ShowDocUpdateRequest;
import com.liuzhihang.doc.view.facade.dto.ShowDocUpdateResponse;

/**
 * ShowDoc 文档对接
 * <p>
 * <p>
 * https://www.showdoc.com.cn/page/102098
 *
 * @author liuzhihang
 * @date 2021/7/27 12:43
 */
public interface ShowDocFacadeService {

    /**
     * 上传到 ShowDoc
     *
     * @param request
     * @return
     */
    ShowDocUpdateResponse updateByApi(ShowDocUpdateRequest request) throws Exception;

}
