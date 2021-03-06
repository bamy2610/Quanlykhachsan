package edu.poly.fpt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.poly.fpt.entities.DanhGia;
import edu.poly.fpt.entities.KhachSan;
import edu.poly.fpt.entities.TaiKhoan;

public interface DanhgiaService { 

	void deleteAll();

	void deleteAll(List<DanhGia> entities);

	void delete(DanhGia entity);

	void deleteById(Integer id);

	long count();

	List<DanhGia> findAllById(List<Integer> ids);

	Iterable<DanhGia> findAll();

	boolean existsById(Integer id);

	Optional<DanhGia> findById(Integer id);

	List<DanhGia> saveAll(List<DanhGia> entities);

	DanhGia save(DanhGia entity);

	List<KhachSan> findAllKhachsans();

	List<TaiKhoan> findAllTaikhoans();
	@Query(value="select a.* from dbquanlykhachsan.tbdanhgia a inner join dbquanlykhachsan.tbkhachsan b on a.khachsan_id= b.id where b.id= :id",nativeQuery = true)	 
	List<Object[]> listdanhgia(long id) ;
}
