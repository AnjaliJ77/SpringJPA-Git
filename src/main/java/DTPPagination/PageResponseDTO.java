package DTO.Pagination;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class PageResponseDTO<T>{
    private List<T> data;
    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private long totalElements;
    private boolean last;

    public PageResponseDTO(List<T> data, int pageNumber, int pageSize, int totalPages, long totalElements, boolean last) {
        this.data = data;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.last = last;
    }
}
